package com.backend.springunik.service;

import com.backend.springunik.dto.request.CommentRequest;
import com.backend.springunik.dto.response.CommentResponse;
import com.backend.springunik.dto.response.TaskCommentResponse;

import java.util.List;

public interface CommentService {

    TaskCommentResponse createComment(Long taskId, String token, CommentRequest request);
    TaskCommentResponse updateComment(Long taskId, String token, CommentRequest request);
    TaskCommentResponse deleteComment(Long commentId, Long taskId, String token);
    List<CommentResponse> getAllComments(Long taskId);

}
