package com.net.lznvideo.video.controller;

import com.net.lznvideo.video.domain.Video;
import com.net.lznvideo.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//127.0.0.1:8082/api/v1/video/page
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping("page")
    public Object pageVideo(){

        return videoService.findAll();
    }


    @GetMapping("find_by_id")
    public Object findById(int videoId){

        return videoService.findById(videoId);
    }


    @DeleteMapping("del_by_id")
    public Object delById(int videoId){

        return videoService.delete(videoId);
    }


    @PutMapping("update_by_id")
    public Object update(int videoId, String title){

        Video video = new Video();
        video.setId(videoId);
        video.setTitle(title);
        return videoService.update(video);
    }

    @PostMapping("save")
    public Object save(String title){

        Video video = new Video();
        video.setTitle(title);
        return videoService.save(video);
    }



}
