package com.xuetangx.zidongdati.xuetangyun.dto;
import lombok.*;


public class CourseDto {
    private Integer id; //4065

    private String name; //习近平新时代中国特色社会主义思想（2018秋）

    private String course_id; //course-v1:TsinghuaX+hbu_2018031901X+2018_T2

    private String thumbnail; ///asset-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@asset+block@3333.jpg

    private String status; //ing

    private boolean credit; //false

    private Integer plat_id; //211

    private String term; //2018秋季

    private String start; //2018-08-01T00:00:00Z

    private String end; //2018-12-02T15:30:00Z

    private String term_start; //2018-07-01T00:00:00Z

    private String term_end; //2019-01-31T00:00:00Z

    private String courseware_url; ///courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware

    private CourseScheduleDto schedule;

    private boolean unsubscribe; //true

    private boolean downloadable; //true

    private Integer has_book; //0

    private boolean creditcast; //false

    private Integer castcount; //0

    private boolean castliving; //false

    private boolean elective; //false

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public Integer getPlat_id() {
        return plat_id;
    }

    public void setPlat_id(Integer plat_id) {
        this.plat_id = plat_id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTerm_start() {
        return term_start;
    }

    public void setTerm_start(String term_start) {
        this.term_start = term_start;
    }

    public String getTerm_end() {
        return term_end;
    }

    public void setTerm_end(String term_end) {
        this.term_end = term_end;
    }

    public String getCourseware_url() {
        return courseware_url;
    }

    public void setCourseware_url(String courseware_url) {
        this.courseware_url = courseware_url;
    }

    public CourseScheduleDto getSchedule() {
        return schedule;
    }

    public void setSchedule(CourseScheduleDto schedule) {
        this.schedule = schedule;
    }

    public boolean isUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(boolean unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public Integer getHas_book() {
        return has_book;
    }

    public void setHas_book(Integer has_book) {
        this.has_book = has_book;
    }

    public boolean isCreditcast() {
        return creditcast;
    }

    public void setCreditcast(boolean creditcast) {
        this.creditcast = creditcast;
    }

    public Integer getCastcount() {
        return castcount;
    }

    public void setCastcount(Integer castcount) {
        this.castcount = castcount;
    }

    public boolean isCastliving() {
        return castliving;
    }

    public void setCastliving(boolean castliving) {
        this.castliving = castliving;
    }

    public boolean isElective() {
        return elective;
    }

    public void setElective(boolean elective) {
        this.elective = elective;
    }
}
