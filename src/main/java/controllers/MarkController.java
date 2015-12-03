package controllers;



import core.entity.Mark;
import core.services.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 12/3/15.
 */
@RestController
@Controller
@RequestMapping(value = "/")
public class MarkController {
    @Autowired
    MarkService markService;

    @RequestMapping(value = "/marks", method = RequestMethod.GET)
    List<Mark> getMark(){
        return markService.getAllMarks();
    }

    @RequestMapping(value = "/marks/", method = RequestMethod.POST)
    public void addMark(@RequestBody Mark mark) {
        markService.createMark(mark);

    }

    @RequestMapping(value = "/marks/{id}", method = RequestMethod.DELETE)
    public void deleteMark(@PathVariable("id") Integer id) {
        markService.deleteMark(id);
    }
}
