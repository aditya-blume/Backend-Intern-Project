package org.example.Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonStorageCrux {
    private String orgCode;
    private String templateName;
    private String mode;
    private long id;
    public JsonStorageCrux(String orgCode, String templateName, String mode, long id) {
        this.id = id;
        this.orgCode = orgCode;
        this.templateName = templateName ;
        this.mode = mode;
    }


}
