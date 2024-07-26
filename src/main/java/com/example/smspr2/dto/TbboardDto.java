package com.example.smspr2.dto;

import com.example.smspr2.domain.Tbboard;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

public class TbboardDto {

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateReqDto{
        @Schema(description = "title", example="")
        @NotNull
        @NotEmpty
        @Size(max=400)
        private String title;
        @Schema(description = "author", example="")
        @NotNull
        @NotEmpty
        @Size(max=400)
        private String author;
        @Schema(description = "content", example="")
        @Size(max=4000)
        private String content;

        public Tbboard toEntity(){
            return Tbboard.of(title, author, content);
        }
    }
    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateResDto{
        private String id;
    }
    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UpdateReqDto{

        @Schema(description = "id", example="")
        @NotNull
        @NotEmpty
        private String id;

        @Schema(description = "title", example="")
        @Size(max=400)
        private String title;
        @Schema(description = "author", example="")
        @Size(max=400)
        private String author;
        @Schema(description = "content", example="")
        @Size(max=4000)
        private String content;

    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SelectReqDto{
        @Schema(description = "id", example="")
        @NotNull
        @NotEmpty
        private String id;
    }
    @Schema
    @Getter
    @Setter
    public static class SelectResDto{
        private String id;
        private String deleted;
        private String process;
        private String createdAt;
        private String modifiedAt;

        private String title;
        private String author;
        private String content;
    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ListReqDto{
        @Schema(description = "deleted", example="")
        private String deleted;
        @Schema(description = "title", example="")
        private String title;
        @Schema(description = "author", example="")
        private String author;
    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PagedListReqDto{

        @Schema(description = "callpage", example="")
        private Integer callpage;
        @Schema(description = "perpage", example="")
        private Integer perpage;
        @Schema(description = "orderby", example="")
        private String orderby;
        @Schema(description = "orderway", example="")
        private String orderway;

        //원래는 고객한테 받으면 안되는 정보!
        @Schema(description = "offset", example="")
        private Integer offset;

        @Schema(description = "deleted", example="")
        private String deleted;
        @Schema(description = "title", example="")
        private String title;
        @Schema(description = "author", example="")
        private String author;
    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PagedListResDto{

        @Schema(description = "callpage", example="")
        private Integer callpage;
        @Schema(description = "perpage", example="")
        private Integer perpage;
        @Schema(description = "orderby", example="")
        private String orderby;
        @Schema(description = "orderway", example="")
        private String orderway;

        @Schema(description = "listsize", example="")
        private Integer listsize;
        @Schema(description = "pagesize", example="")
        private Integer pagesize;

        @Schema(description = "list", example="")
        private List<SelectResDto> list;

    }


    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ScrollListReqDto{

        @Schema(description = "cursor", example="")
        private String cursor;
        @Schema(description = "perpage", example="")
        private Integer perpage;
        @Schema(description = "orderby", example="")
        private String orderby;
        @Schema(description = "orderway", example="")
        private String orderway;

        @Schema(description = "deleted", example="")
        private String deleted;
        @Schema(description = "title", example="")
        private String title;
        @Schema(description = "author", example="")
        private String author;
    }

}