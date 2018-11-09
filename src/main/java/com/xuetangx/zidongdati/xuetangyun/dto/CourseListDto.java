package com.xuetangx.zidongdati.xuetangyun.dto;
import lombok.*;

import java.util.List;

public class CourseListDto {
    private Integer count;

    private String next;

    private String previous;

    private List<CourseDto> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<CourseDto> getResults() {
        return results;
    }

    public void setResults(List<CourseDto> results) {
        this.results = results;
    }
}
