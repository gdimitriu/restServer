/*
 Copyright (c) 2021 Gabriel Dimitriu All rights reserved.
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.

 This file is part of restServer project.

 restServer is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 restServer is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with poc_aws.  If not, see <http://www.gnu.org/licenses/>.
 */
package restserver.server.entrypoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryPointController {

    private static final Logger log = LoggerFactory.getLogger(EntryPointController.class);

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo() {
        log.debug("MyEntryPoint");
        return "MyEntryPoint";
    }

    @RequestMapping(value = "/secured", method = RequestMethod.GET)
    public String getSecured() {
        log.debug("MySecuredInfo");
        return "MySecuredInfo";
    }

}
