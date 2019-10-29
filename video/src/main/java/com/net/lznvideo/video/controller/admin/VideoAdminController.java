package com.net.lznvideo.video.controller.admin;

import com.net.lznvideo.video.domain.Video;
import com.net.lznvideo.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员操作视频控制类
 */
@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {
    @Autowired
    private VideoService videoService;

    /**
     * 根据id删除视频
     *
     * @param videoId
     * @return
     */
    @DeleteMapping("del_by_id")
    public Object delById(
            @RequestParam(value = "video_id", required = true) int videoId
    ) {

        return videoService.delete(videoId);
    }

    /**
     * 根据video更新视频
     *
     * @param video
     * @return
     */
    @PutMapping("update_by_id")
    public Object update(
            @RequestBody Video video//说明绑定了很多参数
    ) {
        return videoService.update(video);
    }

    /**
     * 保存视频对象
     *
     * @param video
     * @return
     */
    @PostMapping("save")
    public Object save(@RequestBody Video video) {
        return videoService.save(video);
    }

}
