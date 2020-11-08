package com.a_linOnline.demo.util;

import lombok.Data;

@Data
public class BaseEntity {
    private String createdBy;
    private String gmtCreate;
    private String lastModified;
    private int isDeleted;
    private int sortNo;
    private int version;
    private String tokenBackend;
}
