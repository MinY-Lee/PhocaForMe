package com.phofor.phocaforme.idol.service;

import com.phofor.phocaforme.auth.dto.response.IdolGroupResponseDto;
import com.phofor.phocaforme.idol.repository.IdolGroupRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class IdolSelectServiceImpl implements IdolSelectService{

    private final IdolGroupRepository idolGroupRepository;

    @Override
    public List<IdolGroupResponseDto> findAll() {
        return null;
    }
}
