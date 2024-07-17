package com.example.smspr2.domain;

import com.example.smspr2.dto.TbpostDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//Entity에는 무조건 ID(PK)가 존재해야함
@Getter
@Table(indexes = {
        @Index(columnList = "deleted")
        ,@Index(columnList = "process")
        ,@Index(columnList = "createdAt")
        ,@Index(columnList = "modifiedAt")
}) //인덱스 키가 유니크 키(여러개를 한번에 설정할때) 등을 설정할 수 있음.
@Entity
public class Tbpost extends AuditingFields {
   @Setter @Column(nullable = false, length=400) private String title;;
    @Setter @Column(nullable = false, length=400) private String author;;
    @Setter @Column(nullable = false, length=10000) @Lob String content;;


    protected Tbpost() {}
         private Tbpost(String title, String author, String content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }
        public static Tbpost of(String title, String author, String content) {
            return new Tbpost(title, author, content);
        }
        public TbpostDto.CreateResDto toCreateResDto(){return TbpostDto.CreateResDto.builder().id(this.getId()).build();
        }
    }
