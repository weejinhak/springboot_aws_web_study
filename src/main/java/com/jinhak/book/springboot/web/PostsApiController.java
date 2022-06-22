package com.jinhak.book.springboot.web;

import com.jinhak.book.springboot.service.posts.PostsService;
import com.jinhak.book.springboot.web.dto.PostsResponseDto;
import com.jinhak.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

	private final PostsService postsService;

	@PostMapping("/api/v1/posts")
	public Long save(@RequestBody PostsSaveRequestDto requestDto) {
		return postsService.save(requestDto);
	}

	@GetMapping("/api/v1/posts/{id}")
	public PostsResponseDto findBtId(@PathVariable Long id) {
		return postsService.findById(id);
	}

}
