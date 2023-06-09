package com.tuling.testAutowired.autowiredInMethod;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by smlz on 2019/5/24.
 */
//@Component
public class TulingAspect {

    private TulingLog tulingLog;

    public TulingLog getTulingLog() {
        return tulingLog;
    }

    //@Autowired
    public void setTulingLog(TulingLog tulingLog) {
        this.tulingLog = tulingLog;
    }

    @Override
    public String toString() {
        return "TulingAspect{" +
                "tulingLog=" + tulingLog +
                '}';
    }

    @Autowired
    public TulingAspect(TulingLog tulingLog) {
        this.tulingLog = tulingLog;
    }
}
