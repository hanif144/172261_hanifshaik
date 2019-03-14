package org.han.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.han.rest.messenger.model.Message;
import org.han.rest.messenger.services.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return service.getAllMessages();
	}
	

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id)
	{
		return service.getMessage(id);
	}

}
