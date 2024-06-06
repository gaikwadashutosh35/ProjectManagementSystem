import { Avatar, AvatarFallback } from "@/components/ui/avatar";
import { Button } from "@/components/ui/button";
import { TrashIcon } from "@radix-ui/react-icons";

const CommentCard = () => {
  return (
    <div className="flex justify-between items-center">
      <div className="flex items-center gap-4">
        <Avatar>
          <AvatarFallback>A</AvatarFallback>
        </Avatar>
        <div className="space-y-1">
          <p>Code with Ash</p>
          <p>how much working pending</p>
        </div>
      </div>
      <Button className="rounded-full items-center" variant="ghost" size="icon">
        <TrashIcon />
      </Button>
    </div>
  );
};

export default CommentCard;
