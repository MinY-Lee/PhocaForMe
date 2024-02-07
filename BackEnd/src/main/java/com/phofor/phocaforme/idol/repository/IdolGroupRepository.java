package com.phofor.phocaforme.idol.repository;

import com.phofor.phocaforme.idol.entity.IdolGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdolGroupRepository extends JpaRepository<IdolGroup, Long> {

//    @Query("""
//        SELECT new com.phofor.phocaforme.auth.dto.response.IdolGroupResponseDto
//        (idolGroup.idolGroupId, idolGroup.idolGroupName, idolGroup.gender)
//        from IdolGroup idolGroup
//    """)
    List<IdolGroup> findAll();  // 모든 아이돌 그룹 리스트 불러오기
}
