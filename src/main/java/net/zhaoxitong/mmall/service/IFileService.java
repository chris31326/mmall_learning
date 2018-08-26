package net.zhaoxitong.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chris on 8/25/2018.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
