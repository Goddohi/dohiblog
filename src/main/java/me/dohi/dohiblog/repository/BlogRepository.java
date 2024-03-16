package me.dohi.dohiblog.repository;

import me.dohi.dohiblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

