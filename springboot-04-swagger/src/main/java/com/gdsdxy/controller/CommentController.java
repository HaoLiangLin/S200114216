package com.gdsdxy.controller;

import com.gdsdxy.entity.Comment;
import com.gdsdxy.service.IComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/comments")
@Api(tags = "Comment", value = "评论接口")
public class CommentController {
    @Resource
    private IComment iComment;

    @ApiOperation(value = "新增评论")
    @PostMapping
    public int addComment(@RequestBody Comment comment) {
        int rs = iComment.addComment(comment);
        return rs;
    }
}
