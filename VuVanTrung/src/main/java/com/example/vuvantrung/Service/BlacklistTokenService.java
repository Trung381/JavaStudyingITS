package com.example.vuvantrung.Service;

import com.example.vuvantrung.Repository.BlacklistedTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BlacklistTokenService {

    @Autowired
    private BlacklistedTokenRepository blacklistedTokenRepository;

    @Async
    public void removeTokensAsync() {
        blacklistedTokenRepository.deleteExpiredTokens();
        System.out.println("quec quec, xoa token after ngay dai");
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void removeTokenScheduled(){
        removeTokensAsync();
    }
}