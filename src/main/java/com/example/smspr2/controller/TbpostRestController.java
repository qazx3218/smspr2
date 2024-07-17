package com.example.smspr2.controller;

import com.example.smspr2.dto.TbpostDto;
import com.example.smspr2.service.TbpostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Tag(name = "1-1. 게시글 API 안내",
        description = "게시글 관련 기능 정의한 RestController.")
@RequestMapping("/api/tbpost")
@RestController
public class TbpostRestController {

    private TbpostService tbpostService;
    public TbpostRestController(TbpostService tbpostService) {
        this.tbpostService = tbpostService;
    }

    @Operation(summary = "게시글 생성",
            description = "게시글 생성 컨트롤러 (사용자만 접근 가능) <br />"
                    + "@param TbpostDto.CreateReqDto <br />"
                    + "@return HttpStatus.CREATED(201) ResponseEntity\\<TbpostDto.CreateResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @PostMapping("")
    public ResponseEntity<TbpostDto.CreateResDto> create(@Valid @RequestBody TbpostDto.CreateReqDto param){
        return ResponseEntity.status(HttpStatus.CREATED).body(tbpostService.create(param));
    }


    @Operation(summary = "게시글 수정",
            description = "게시글 수정 컨트롤러 (사용자만 접근 가능) <br />"
                    + "@param TbpostDto.UpdateReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbpostDto.CreateResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @PutMapping("")
    public ResponseEntity<TbpostDto.CreateResDto> update(@Valid @RequestBody TbpostDto.UpdateReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbpostService.update(param));
    }

    @Operation(summary = "게시글 조회",
            description = "게시글 조회 컨트롤러 (사용자만 접근 가능) <br />"
                    + "@param TbpostDto.SelectReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbpostDto.SelectResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @GetMapping("")
    public ResponseEntity<TbpostDto.SelectResDto> detail(@Valid TbpostDto.SelectReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbpostService.detail(param));
    }

}