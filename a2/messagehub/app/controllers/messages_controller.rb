class MessagesController < ApplicationController
	def new
	end
	def index
		@messages = Message.all
	end
	def create
        @message = Message.new(message_params)

		if @message.save
			redirect_to @message
		else
			render 'index'
		end

	end
	def show
		@message = Message.find(params[:id])
	end
	private
		def message_params
			params.require(:message).permit(:app_id, :content, :username, :active, :created_at, :updated_at)
		end
end
