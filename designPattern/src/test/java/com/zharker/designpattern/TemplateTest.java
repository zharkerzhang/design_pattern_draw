package com.zharker.designpattern;

import com.zharker.designpattern.templatemethod.AbstractTemplate;
import com.zharker.designpattern.templatemethod.ConCreteTemplate1;
import com.zharker.designpattern.templatemethod.ConCreteTemplate2;
import org.junit.Test;

public class TemplateTest {
    @Test
    public void templateTest1(){
        AbstractTemplate t1 = new ConCreteTemplate1();
        AbstractTemplate t2 = new ConCreteTemplate2();

        t1.templateMethod();
        t2.templateMethod();
    }
}
