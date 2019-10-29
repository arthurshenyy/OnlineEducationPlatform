package com.net.lznvideo.video.controller;

import com.net.lznvideo.video.domain.Video;
import com.net.lznvideo.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//127.0.0.1:8082/api/v1/video/page

/**
 * video接口
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    /**
     * 分页接口
     *
     * @param page 当前第几页，默认是第一页
     * @param size 每页显示几条，默认显示10条
     * @return
     */
    @GetMapping("page")
    public Object pageVideo(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ) {

        return videoService.findAll();
    }

    /**
     * 根据id找视频
     *
     * @param videoId
     * @return
     */
    @GetMapping("find_by_id")
    public Object findById(
            @RequestParam(value = "video_id", required = true) int videoId
    ) {

        return videoService.findById(videoId);
    }

}
