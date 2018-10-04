package com.cfr.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cfr.dao.MstTaxTypeDAO;
import com.cfr.model.MstTaxType;
import com.cfr.model.TrnInvoice;

@Controller 
public class indexController {

	//private Map<Long, MstTaxType> taxTypeMap = new HashMap<>();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String submit(@ModelAttribute("trnInvoice")TrnInvoice tx) {
	    return "taxIndex";
	}
	
	
	@RequestMapping(value = "/saveTaxType", method = RequestMethod.POST)
    public String submit(
      @ModelAttribute("mstTaxType")MstTaxType voTaxType,BindingResult result, ModelMap model) {
		System.out.println("ModelAttribute test");
		MstTaxTypeDAO txdao = new MstTaxTypeDAO();
		txdao.saveTaxType(voTaxType);
		System.out.println("in Controller  "+voTaxType.toString());
        model.addAttribute("taxTypeCode", voTaxType.getTaxTypeCode());
        model.addAttribute("description", voTaxType.getDescription());

        return "taxIndex";
    }
	
//	@RequestMapping(value = "/getTaxtype", method = RequestMethod.POST)
//    public String get() {
//		System.out.println("get tax type");
//		MstTaxTypeDAO txdao = new MstTaxTypeDAO();
//		ModelMap model = new ModelMap();
//	    model.put("mstTaxType", txdao.getTaxType());
//		return "taxIndex";
//    }
	
	
	@ModelAttribute
	   public void getModel(Model model) {
//	      MstTaxType tx = new MstTaxType();
//	      tx.setTaxTypeCode("tx02");
//	      tx.setDescription("tx02 Test2");
//	      tx.setActive("Y");
//	      System.out.println(tx.toString());
//	      model.addAttribute("mstTaxType", tx);
		MstTaxTypeDAO txdao = new MstTaxTypeDAO();
		
		model.addAttribute("trnInvoice", txdao.getTaxType());
		
	   }
	
	
}
