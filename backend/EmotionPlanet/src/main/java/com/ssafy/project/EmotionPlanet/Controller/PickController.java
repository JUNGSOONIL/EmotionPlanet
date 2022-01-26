package com.ssafy.project.EmotionPlanet.Controller;


import com.ssafy.project.EmotionPlanet.Dto.FeedDto;
import com.ssafy.project.EmotionPlanet.Dto.FeedLikeDto;
import com.ssafy.project.EmotionPlanet.Dto.ImgDto;
import com.ssafy.project.EmotionPlanet.Dto.PickDto;
import com.ssafy.project.EmotionPlanet.Service.PickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(
        origins = "http://localhost:5500",
        allowCredentials = "true",
        allowedHeaders ="*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
                RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS }
)
@RestController
public class PickController {

    @Autowired
    PickService pickService;

    private static final int SUCCESS = 1;

    @PostMapping(value ="/picks") // 목록 생성
    public ResponseEntity<Integer> create(@RequestBody PickDto pickDto) {

        int result = pickService.create(pickDto);
        if(result == SUCCESS) {
            return new ResponseEntity<Integer>(result, HttpStatus.OK);
        }else {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "양식이 올바르지 않습니다.");
        }
    }

    @GetMapping(value ="/picks/{no}") // 해당 목록 가져오기
    public ResponseEntity<PickDto> list(@PathVariable String no) {
        int pickNo = Integer.parseInt(no);
        PickDto pick = pickService.select(pickNo);
        if(pick != null) {
            return new ResponseEntity<PickDto>(pick, HttpStatus.OK);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "해당 목록이 없습니다.");
        }
    }

    @GetMapping(value ="/picks/user/{no}") // 유저가 만든 목록
    public ResponseEntity<List<PickDto>> userList(@PathVariable String no) {
        int userNo = Integer.parseInt(no);
        List<PickDto> picks = pickService.list(userNo);
        if(picks != null) {
            return new ResponseEntity<List<PickDto>>(picks, HttpStatus.OK);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "작성된 목록이 없습니다.");
        }
    }

    @PutMapping(value ="/picks") // 목록 수정
    public ResponseEntity<Integer> update(@RequestBody PickDto pickDto) {
        int result = pickService.update(pickDto);
        if(result == SUCCESS) {
            return new ResponseEntity<Integer>(result, HttpStatus.OK);
        }else {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "수정에 실패 했습니다.");
        }
    }

    @DeleteMapping(value ="/picks/{no}") // 목록 삭제
    public ResponseEntity<Integer> delete(@PathVariable String no) {
        int pickNo = Integer.parseInt(no);
        int result = pickService.delete(pickNo);
        if(result == SUCCESS) {
            return new ResponseEntity<Integer>(result, HttpStatus.OK);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "목록을 찾을 수 없습니다.");
        }
    }

    @PostMapping(value ="/picks/like") // 좋아요
    public ResponseEntity<Integer> like(@RequestBody FeedLikeDto feedLikeDto) {
        int pickNo = feedLikeDto.getFeedNo();
        int userNo = feedLikeDto.getUserNo();

        int result = pickService.like(userNo, pickNo);
        if(result == SUCCESS) {
            return new ResponseEntity<Integer>(result, HttpStatus.OK);
        }else {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "오류 발생.");
        }
    }

    @DeleteMapping(value ="/picks/like") // 좋아요 취소
    public ResponseEntity<Integer> unlike(@RequestBody FeedLikeDto feedLikeDto) {
        int pickNo = feedLikeDto.getFeedNo();
        int userNo = feedLikeDto.getUserNo();

        int result = pickService.unlike(userNo, pickNo);
        if(result == SUCCESS) {
            return new ResponseEntity<Integer>(result, HttpStatus.OK);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "오류 발생.");
        }
    }
}
