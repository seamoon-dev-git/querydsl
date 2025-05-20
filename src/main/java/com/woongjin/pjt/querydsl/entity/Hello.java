package com.woongjin.pjt.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Hello 클래스
 *
 * <p>
 *
 * @author seamoon
 * @since 2025. 5. 21.
 */
@Entity
@Getter
@Setter
public class Hello {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
