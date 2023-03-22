package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

@Controller
public class HoldidayController {

//    public String getHoliday(Model model, @RequestParam(required = false) boolean festival,@RequestParam(required = false) boolean federal){
    @GetMapping("/holidays/{display}")
    public String getHoliday(Model model, @PathVariable String display){
        if(display.equalsIgnoreCase("federal")){
            model.addAttribute("festival",false);
            model.addAttribute("federal",true);
        } else if(display.equalsIgnoreCase("festival")) {
            model.addAttribute("festival",true);
            model.addAttribute("federal",false);
        } else{
            model.addAttribute("festival",true);
            model.addAttribute("federal",true);
        }

        List<Holiday> holidays = Arrays.asList(
                new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday(" Oct 31 ","Halloween", Holiday.Type.FESTIVAL),
                new Holiday(" Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday(" Dec 25 ","Christmas", Holiday.Type.FESTIVAL),
                new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday(" July 4 ","Independence Day", Holiday.Type.FEDERAL),
                new Holiday(" Sep 5 ","Labor Day", Holiday.Type.FEDERAL),
                new Holiday(" Nov 11 ","Veterans Day", Holiday.Type.FEDERAL)
        );
        Holiday.Type enumTypes[] = Holiday.Type.values();
        for(Holiday.Type type:enumTypes){
            model.addAttribute(type.toString(),holidays.stream().filter(h -> h.getType()==type).toArray());
        }
        return "holidays.html";
    }
}
