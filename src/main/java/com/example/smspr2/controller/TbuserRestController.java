package com.example.smspr2.controller;

import com.example.smspr2.dto.TbuserDto;
import com.example.smspr2.service.TbuserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "0-1. 사용자 API 안내",
        description = "사용자 관련 기능 정의한 RestController.")
@RequestMapping("/api/tbuser")
@RestController
public class TbuserRestController {

    private TbuserService tbuserService;
    public TbuserRestController(TbuserService tbuserService) {
        this.tbuserService = tbuserService;
    }

    @Operation(summary = "사용자 로그인",
            description = "사용자 로그인 컨트롤러 <br />"
                    + "@param TbuserDto.LoginReqDto <br />"
                    + "@return HttpStatus.CREATED(201) ResponseEntity\\<TbuserDto.CreateResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @PostMapping("/login")
    public ResponseEntity<TbuserDto.CreateResDto> login(@Valid @RequestBody TbuserDto.LoginReqDto param){
        return ResponseEntity.status(HttpStatus.CREATED).body(tbuserService.login(param));
    }
    @Operation(summary = "사용자 가입",
            description = "사용자 가입 컨트롤러 <br />"
                    + "@param TbuserDto.SignupReqDto <br />"
                    + "@return HttpStatus.CREATED(201) ResponseEntity\\<TbuserDto.CreateResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @PostMapping("/signup")
    public ResponseEntity<TbuserDto.CreateResDto> signup(@Valid @RequestBody TbuserDto.SignupReqDto param){
        return ResponseEntity.status(HttpStatus.CREATED).body(tbuserService.signup(param));
    }

    /**/

    @Operation(summary = "사용자 생성",
            description = "사용자 생성 컨트롤러 <br />"
                    + "@param TbuserDto.CreateReqDto <br />"
                    + "@return HttpStatus.CREATED(201) ResponseEntity\\<TbuserDto.CreateResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @PostMapping("")
    public ResponseEntity<TbuserDto.CreateResDto> create(@Valid @RequestBody TbuserDto.CreateReqDto param){
        return ResponseEntity.status(HttpStatus.CREATED).body(tbuserService.create(param));
    }

    @Operation(summary = "사용자 수정",
            description = "사용자 수정 컨트롤러 <br />"
                    + "@param TbuserDto.UpdateReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbuserDto.CreateResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @PutMapping("")
    public ResponseEntity<TbuserDto.CreateResDto> update(@Valid @RequestBody TbuserDto.UpdateReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbuserService.update(param));
    }

    @Operation(summary = "사용자 상세 조회",
            description = "사용자 상세 조회 컨트롤러 <br />"
                    + "@param TbuserDto.SelectReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbuserDto.SelectResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @GetMapping("")
    public ResponseEntity<TbuserDto.SelectResDto> detail(@Valid TbuserDto.SelectReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbuserService.detail(param));
    }
    @Operation(summary = "사용자 목록 전체 조회",
            description = "사용자 목록 전체 조회 컨트롤러 <br />"
                    + "@param TbuserDto.ListReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbuserDto.SelectResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @GetMapping("/list")
    public ResponseEntity<List<TbuserDto.SelectResDto>> list(@Valid TbuserDto.ListReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbuserService.list(param));
    }

    @Operation(summary = "사용자 목록 페이지 조회",
            description = "사용자 목록 페이지 조회 컨트롤러 <br />"
                    + "@param TbuserDto.PagedListReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbuserDto.PagedListResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @GetMapping("/plist")
    public ResponseEntity<TbuserDto.PagedListResDto> plist(@Valid TbuserDto.PagedListReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbuserService.pagedList(param));
    }
    @Operation(summary = "사용자 목록 스크롤 조회",
            description = "사용자 목록 스크롤 조회 컨트롤러 <br />"
                    + "@param TbuserDto.MoreListReqDto <br />"
                    + "@return HttpStatus.OK(200) ResponseEntity\\<TbuserDto.SelectResDto\\> <br />"
                    + "@exception 필수 파라미터 누락하였을 때 등 <br />"
    )
    @GetMapping("/mlist")
    public ResponseEntity<List<TbuserDto.SelectResDto>> mlist(@Valid TbuserDto.ScrollListReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbuserService.scrollList(param));
    }

}