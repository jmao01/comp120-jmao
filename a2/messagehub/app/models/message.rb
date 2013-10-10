class Message < ActiveRecord::Base
	belongs_to :app
	before_save :default_values
	def default_values
		message.active = true
	end
	validates :app_id, presence: true
	validates :content, presence: true, length: {maximum: 160}
	validates :username, presence: true, length: {minimum: 3, maximum: 60}
	validates_format_of :username, :with => /\A([a-zA-Z0-9-_])\Z/i, :on => :create
	#/\A([^@\s]+)@((?:[-a-z0-9-_]+\.)+[a-z]{2,})\Z/i
end
