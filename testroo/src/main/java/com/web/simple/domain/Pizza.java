package com.web.simple.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Pizza {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String name;

    /**
     */
    private Float price;

    /**
     */
    @ManyToOne
    private Base base;
}
