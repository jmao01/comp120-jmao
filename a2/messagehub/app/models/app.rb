class App < ActiveRecord::Base
	has_many :messages
	before_save :default_values
	def default_values
		app.active = true
	end
	validates :app_title, presence: true
	validates :description, presence:true
end
