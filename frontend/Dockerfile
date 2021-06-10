FROM node:16.3.0

WORKDIR /app

ENV PATH /frontend/node_modules/.bin:$PATH

COPY package.json ./

COPY yarn.lock ./

RUN yarn

COPY . ./

EXPOSE 3000

CMD ["yarn", "start"]