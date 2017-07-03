package com.hello.controllers;

import com.hello.domain.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wrokita on 19/06/2017.
 */

@RestController
public class TaskController {

    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/task")
    public Task getTask(@RequestParam(value="id") String id) {

        return buildNewRandomTaskWithId(counter.incrementAndGet(), id);
    }

    private Task buildNewRandomTaskWithId(long l, String id) {
        Task task = new Task();
        return new Task.TaskBuilder("title-"+l, "description-" + id).build();
    }
}
