package com.net.lznvideo.video.mapper;

import com.net.lznvideo.video.domain.Video;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * video数据访问层
 */
public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();

}
