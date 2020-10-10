package com.pl.pleurekaserver.main;

import com.pl.plcommon.Utils.PrintUtils;
import com.pl.pleurekaserver.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class PlEurekaServerRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> list = new ArrayList<>(Arrays.asList("mike", "jane"));
        PrintUtils.print();
        log.info(JsonUtils.objToJsonString(list));
    }

}
