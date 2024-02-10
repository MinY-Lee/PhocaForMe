package com.phofor.phocaforme.board.dto;

import com.phofor.phocaforme.board.entity.Barter;
import com.phofor.phocaforme.board.entity.BarterFindIdol;
import com.phofor.phocaforme.board.entity.BarterImage;
import com.phofor.phocaforme.board.entity.BarterOwnIdol;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
@ToString
public class BarterDetailDto {
    // 게시글 id
    private Long id;
    // 게시글 작성자 id
    private String userId;
    // 게시글 작성자 닉네임
    private String nickName;
    // 앨범명
    private String title;
    // 내용
    private String content;
    // 소유한 멤버(들)
    private List<IdolMemberDto> ownIdolMembers;
    // 찾는 멤버(들)
    private List<IdolMemberDto> findIdolMembers;
    // 포토카드 사진(들)
    private List<String> photos;
    // 카드 종류
    private String cardType;

    private boolean isBartered;
    // 생성 일자
    private Instant registrationDate;
    // Entity -> Dto 바꿔주는 메소드
    public static BarterDetailDto of(Barter barter) {
        LocalDateTime localDateTime = barter.getRegistrationDate();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        return BarterDetailDto.builder()
                .id(barter.getId())
                .userId(barter.getUser().getUserId())
                .nickName(barter.getNickname())
                .title(barter.getTitle())
                .content(barter.getContent())
                .ownIdolMembers(barter.getOwnIdols().stream()
                        .map(ownIdol -> new IdolMemberDto(ownIdol.getIdolMember().getId(), ownIdol.getIdolMember().getName()))
                        .collect(Collectors.toList()))
                .findIdolMembers(barter.getFindIdols().stream()
                        .map(findIdol -> new IdolMemberDto(findIdol.getIdolMember().getId(), findIdol.getIdolMember().getName()))
                        .collect(Collectors.toList()))
                .photos(barter.getImages().stream().map(BarterImage::getImgCode).collect(Collectors.toList()))
                .cardType(barter.getCardType())
                .isBartered(barter.isBartered())
                .registrationDate(instant)
                .build();
    }
}