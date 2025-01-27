package com.example.smspr2.service;


import com.example.smspr2.dto.DefaultDto;
import com.example.smspr2.dto.TbpostDto;

import java.util.List;

public interface TbpostService {
    TbpostDto.CreateResDto create(TbpostDto.CreateReqDto param);
    TbpostDto.CreateResDto update(TbpostDto.UpdateReqDto param);
    TbpostDto.SelectResDto detail(DefaultDto.SelectReqDto param);
    List<TbpostDto.SelectResDto> list(TbpostDto.ListReqDto param);
    DefaultDto.PagedListResDto pagedList(TbpostDto.PagedListReqDto param);
    List<TbpostDto.SelectResDto> scrollList(TbpostDto.ScrollListReqDto param);
}