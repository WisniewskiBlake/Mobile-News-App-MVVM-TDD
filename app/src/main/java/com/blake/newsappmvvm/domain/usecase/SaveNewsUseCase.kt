package com.blake.newsappmvvm.domain.usecase

import com.blake.newsappmvvm.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}