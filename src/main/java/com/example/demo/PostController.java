package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")

public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<POST> getPostById(@PathVariable Long id) {
        POST post = postService.getPostById(id);
        return ResponseEntity.ok(post);
    }

    @GetMapping
    public ResponseEntity<List<POST>> getAllPosts() {
        List<POST> POSTS = postService.getAllPosts();
        return ResponseEntity.ok(POSTS);
    }

    @PostMapping
    public ResponseEntity<POST> createPost(@RequestBody POST post) {
        POST createdPOST = postService.createPost(post);
        return ResponseEntity.ok(createdPOST);
    }

    @PutMapping("/{id}")
    public ResponseEntity<POST> updatePost(@PathVariable Long id, @RequestBody POST post) {
        POST updatedPOST = postService.updatePost(id, post);
        return ResponseEntity.ok(updatedPOST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}

//PostController 클래스는 고객의 요청에 따라 다양한 종류의 음식을 고객에게 제공하는 서버와 같습니다. @RestController 및 @RequestMapping 주석은 레스토랑의 실제 주소와 같이 서버에 액세스할 수 있는 URL 경로를 정의합니다.
//@Autowired 주석은 PostService 클래스의 인스턴스를 컨트롤러에 주입합니다. 이는 요리사가 요리를 준비하는 것과 같습니다.
//@GetMapping 주석은 메뉴에서 특정 요리를 가져오라고 서버에 요청하는 고객과 같습니다. 여기서 요리는 Post 클래스로 표시됩니다. {id} 경로 변수는 고객이 요청한 특정 요리 주문 번호와 같습니다. 'ResponseEntity'는 요청이 성공했는지 여부를 나타내는 상태 코드와 함께 요청된 요리를 포함하는 고객에 대한 서버의 응답과 같습니다.
//@PostMapping 주석은 특정 요청에 따라 서버에 새 요리를 생성하도록 요청하는 고객과 같습니다. @RequestBody 주석은 요리를 준비하는 방법에 대해 셰프에게 지침을 제공하는 고객과 같습니다. 'ResponseEntity'는 고객에 대한 서버의 응답과 같으며 여기에는 새로 생성된 요리와 함께 생성이 성공했는지 여부를 나타내는 상태 코드가 포함됩니다.
//@PutMapping 주석은 고객이 새로운 재료나 지침으로 기존 요리를 업데이트하도록 서버에 요청하는 것과 같습니다. {id} 경로 변수는 고객이 업데이트를 요청한 특정 요리 주문 번호와 같습니다. @RequestBody 주석은 요리를 업데이트하는 방법에 대해 셰프에게 새로운 지침을 제공하는 고객과 같습니다. 'ResponseEntity'는 업데이트 성공 여부를 나타내는 상태 코드와 함께 업데이트된 접시를 포함하는 고객에 대한 서버의 응답과 같습니다.
//@DeleteMapping 주석은 메뉴에서 요리를 제거하도록 서버에 요청하는 고객과 같습니다. {id} 경로 변수는 고객이 삭제를 요청한 특정 요리 주문 번호와 같습니다. ResponseEntity는 제거가 성공했는지 여부를 나타내는 상태 코드를 포함하는 고객에 대한 서버의 응답과 같습니다.