package com.ssafy.project.EmotionPlanet.Dao;

import com.ssafy.project.EmotionPlanet.Dto.CommentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    public List<CommentDto> list(int no);
    public int write(CommentDto commentDto);
    public int update(CommentDto commentDto);
    public int delete(int no);
}
