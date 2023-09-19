package shopmtcoding.streamstudy.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import shopmtcoding.streamstudy.user.User;


@ToString
@Getter @Setter
public class BoardDetailV2DTO {
    private Integer id;
    private String title;
    private String content;
    private UserDTO user;
    private boolean isOwner;


    public BoardDetailV2DTO(Board board, Integer sessionId) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.user = new UserDTO(board.getUser());
        this.isOwner = board.getUser().getId() == sessionId;
    }


    @Getter @Setter
    public class UserDTO{
        private Integer id;
        private String username;


        public UserDTO(User user) {
            this.id = user.getId();
            this.username = user.getUsername();
        }
        

        
    }

    

   

    

}
