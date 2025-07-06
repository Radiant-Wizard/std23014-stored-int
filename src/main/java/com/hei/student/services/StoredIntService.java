package com.hei.student.services;

import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.util.Random;

@Service
public class StoredIntService {
  private final Path filePath = Paths.get("/tmp", "stored-int.txt");
  private final Path filePathLocal = Paths.get("/file", "stored-int.txt");

  public int getLocalStoredInt(){
    try {
      if (Files.exists(filePath)){
        String content = Files.readString(filePath);
        return  Integer.parseInt(content);
      }

      int random = new SecureRandom().nextInt(1_000);
      Files.writeString(
          filePath,
          Integer.toString(random)
      );
      return random;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  public int getStoredInt() {
    try {
      if (Files.exists(filePath)){
        String content = Files.readString(filePath);
        return  Integer.parseInt(content);
      }

      int random = new SecureRandom().nextInt(1_000);
      Files.writeString(
          filePath,
          Integer.toString(random)
      );
      return random;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
