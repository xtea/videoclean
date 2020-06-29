package io.xtea.videoclean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.io.IOException;

/**
 * TODO: doc this.
 *
 * @author xtea
 * @date 2020-06-29 14:17
 */
public class DouyinTest {

    @Test
    public void testParseItemIdFromUrl() {
        String url = "https://www.iesdouyin.com/share/video/6519691519585160455/?region=CN&mid=6519692104368098051&u_code=36fi3lehcdfb&titleType=title\n";
        String itemId = Douyin.parseItemIdFromUrl(url);
        assertEquals("6519691519585160455", itemId);
    }

    @Test
    public void testParseItemIdFromUrl2() {
        String url = "https://www.iesdouyin.com/share/video/sss/?region=CN&mid=6519692104368098051&u_code=36fi3lehcdfb&titleType=title\n";
        String itemId = Douyin.parseItemIdFromUrl(url);
        assertEquals("", itemId);
    }

    @Test
    public void testShortUrl() throws IOException {
        String url = "https://v.douyin.com/JLeDJMo/";
        String ans = Douyin.convertUrl(url);
        assertNotNull(ans);
    }

    @Test
    public void testGet() throws Exception {
        Douyin.Result ans = Douyin.getVideoUrl("6519691519585160455");
        System.out.println(ans);
        assertNotNull(ans);
    }

    @Test
    public void testExtract() {
        String msg = "#比尔拉塞尔 我现在都可以打爆你们 https://v.douyin.com/JLeEkWY/ 复制此链接，打开【抖音短视频】，直接观看视频！";
        String url = Douyin.extractUrl(msg);
        assertEquals("https://v.douyin.com/JLeEkWY/", url);
    }
}
