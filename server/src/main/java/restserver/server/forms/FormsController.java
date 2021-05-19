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
package restserver.server.forms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/forms")
public class FormsController {
    private static final Logger log = LoggerFactory.getLogger(FormsController.class);

    @RequestMapping(value = "/form1", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = {"application/text"})
    public String postForms(@RequestPart("key") String key,
                                    @RequestPart("actor") String actor,
                                    @RequestPart("data")MultipartFile dataFile) {

        try {
            log.info("key=" + key);
            log.info("actor=" + actor);
            log.info("data=" + new String(dataFile.getBytes()));
        } catch (IOException e) {
            return "fail";
        }

        return "success";
    }

    @RequestMapping(value = "/form1_2", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = {"application/text"})
    public String postForms(@RequestPart("key") String key,
                            @RequestPart("actor") String actor,
                            @RequestPart("file1")MultipartFile dataFile1,
                            @RequestPart("file2")MultipartFile dataFile2) {

        try {
            log.info("key=" + key);
            log.info("actor=" + actor);
            log.info("file1=" + new String(dataFile1.getBytes()));
            log.info("file2=" + new String(dataFile2.getBytes()));
        } catch (IOException e) {
            return "fail";
        }

        return "success";
    }

    @RequestMapping(value = "/form2", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = {"application/text"})
    public String postFormsString(@RequestPart("key") String key,
                            @RequestPart("actor") String actor,
                            @RequestPart("data")String dataFile) {

        log.info("key=" + key);
        log.info("actor=" + actor);
        log.info("data=" + dataFile);

        return "success";
    }


    @RequestMapping(value = "/formSecure", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = {"application/text"})
    public String postFormsSecure(@RequestPart("key") String key,
                                    @RequestPart("actor") String actor,
                                    @RequestPart("data")MultipartFile dataFile) {

        try {
            log.info("key=" + key);
            log.info("actor=" + actor);
            log.info("data=" + new String(dataFile.getBytes()));
        }  catch (IOException e) {
            return "fail";
        }

        return "success";
    }
}
