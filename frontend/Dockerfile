FROM node:21-alpine3.18

WORKDIR /frontend

COPY package.json .

# Install dependencies
RUN npm install

# Copy the rest of the application files
COPY . .

EXPOSE 5173
# Start the application
CMD ["npm", "start"]
