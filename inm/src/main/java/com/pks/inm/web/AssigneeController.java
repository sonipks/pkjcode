package com.pks.inm.web;

import com.pks.inm.domain.Assignee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/assignees")
@Controller
@RooWebScaffold(path = "assignees", formBackingObject = Assignee.class)
public class AssigneeController {
}
