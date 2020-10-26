package ImageHoster.controller;

import ImageHoster.model.Image;
import ImageHoster.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private ImageService imageService;

    //This method displays all the images in the user home page after successful login
    @RequestMapping(value = "/image/{imageId}/{imageTitle}/comments", method = RequestMethod.POST)
    public String createNewComment(@PathVariable("imageId") int imageId, @PathVariable("imageTitle") String imageTitle, @RequestParam("comments") String comments) {
        imageService.createNewComment(imageId, comments);
        return "redirect:/images/imageId/imageTitle";
    }
}
