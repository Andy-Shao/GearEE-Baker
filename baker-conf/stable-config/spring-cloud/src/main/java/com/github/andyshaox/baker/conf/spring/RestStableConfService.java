package com.github.andyshaox.baker.conf.spring;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.andyshaox.baker.conf.StableConfService;
import com.github.andyshaox.baker.conf.vo.CoordinationStableArgs;
import com.github.andyshaox.baker.conf.vo.PackagerStableArgs;

/**
 * 
 * Title:<br>
 * Descript:<br>
 * Copyright: Copryright(c) 20 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 */
@RestController
@RequestMapping(value = "/RestStableConfService", method = RequestMethod.GET)
public class RestStableConfService implements StableConfService {

    @RequestMapping("/coordinationStableArgsMapping")
    @Override
    public Map<String , CoordinationStableArgs> coordinationStableArgsMapping() {
        // TODO Auto-generated method stub
        return null;
    }

    @RequestMapping("/getPackagerArgs")
    @Override
    public PackagerStableArgs getPackagerArgs(@RequestParam("packagerType") String packagerType) {
        // TODO Auto-generated method stub
        return null;
    }

    @RequestMapping("/getStableArgs")
    @Override
    public CoordinationStableArgs getStableArgs(@RequestParam("coordinationType") String coordinationType) {
        // TODO Auto-generated method stub
        return null;
    }

    @RequestMapping("/isExistCoordination")
    @Override
    public boolean isExistCoordination(@RequestParam("coordinationType") String coordiantionType) {
        // TODO Auto-generated method stub
        return false;
    }

    @RequestMapping("/isEistPackager")
    @Override
    public boolean isExistPackager(@RequestParam("packagerType") String packagerType) {
        // TODO Auto-generated method stub
        return false;
    }

    @RequestMapping("/PackagerStableArgsMapping")
    @Override
    public Map<String , PackagerStableArgs> PackagerStableArgsMapping() {
        // TODO Auto-generated method stub
        return null;
    }

}
