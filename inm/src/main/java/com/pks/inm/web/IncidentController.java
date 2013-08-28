package com.pks.inm.web;

import com.pks.inm.domain.Incident;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/incidents")
@Controller
@RooWebScaffold(path = "incidents", formBackingObject = Incident.class)
@RooWebFinder
public class IncidentController {
}
