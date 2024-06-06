import { Avatar, AvatarFallback } from "@/components/ui/avatar";
import { Button } from "@/components/ui/button";
import { DialogClose } from "@/components/ui/dialog";
import {
  Form,
  FormControl,
  FormField,
  FormItem,
  FormMessage,
} from "@/components/ui/form";
import { Input } from "@/components/ui/input";
import { useForm } from "react-hook-form";

const CreateCommentForm = ({ issueId }) => {
  const form = useForm({
    defaultValues: {
      content: "",
    },
  });
  const onSubmit = (data) => {
    console.log("create project data", data);
  };
  return (
    <div>
      <Form {...form}>
        <form
          className="flex gap-2 items-center"
          onSubmit={form.handleSubmit(onSubmit)}
        >
          <FormField
            control={form.control}
            name="content"
            render={({ field }) => (
              <FormItem className="flex-1">
                <div className="flex gap-2 items-center">
                  <div>
                    <Avatar>
                      <AvatarFallback>A</AvatarFallback>
                    </Avatar>
                  </div>
                  <FormControl className="flex-1">
                    <Input
                      {...field}
                      type="text"
                      className="w-[20rem]"
                      placeholder="write comment here..."
                    />
                  </FormControl>
                </div>

                <FormMessage />
              </FormItem>
            )}
          />

          <Button type="submit">Save</Button>
        </form>
      </Form>
    </div>
  );
};

export default CreateCommentForm;
