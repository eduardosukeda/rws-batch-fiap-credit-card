package br.com.fiap.rwsbatchfiapcreditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Card;
import br.com.fiap.rwsbatchfiapcreditcard.service.CardService;
import br.com.fiap.rwsbatchfiapcreditcard.service.PurchaseService;
import br.com.fiap.rwsbatchfiapcreditcard.util.GeneralUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("card")
public class CardController {

	@Autowired
	CardService cardService;

	@Autowired
	PurchaseService purchaseService;

	@PostMapping
	public Card create(@RequestParam Integer idStudent, @RequestBody Card card) {
		return cardService.create(idStudent, card);
	}

	@DeleteMapping("/{id}")
	public void delete(@RequestParam Integer idStudent, @RequestParam Integer id) {
		cardService.delete(idStudent, id);
	}

	@GetMapping
	public List<Card> list(@RequestParam Integer idStudent) {
		return cardService.findAllByStudent(idStudent);
	}

	@GetMapping("/{id}/extrato")
	@ResponseBody
	public void getExtrato(@RequestParam Integer id, HttpServletResponse response) throws IOException {
		response.setHeader("Content-disposition", "attachment; filename=extrato.xlsx");
		GeneralUtils.extractGenerate(purchaseService.listByCard(id)).write(response.getOutputStream());
	}
}
