FROM openjdk:17-jdk-alpine
RUN apk --no-cache add \
maven \
chromium \
chromium-chromedriver \
bash \
&& rm -rf /var/cache/apk/*

ENV CHROME_BIN=/usr/bin/chromium-browser
ENV CHROME_DRIVER=/usr/bin/chromiumdriver

WORKDIR /usr/src/app

COPY . .

CMD ["mvn","clean","test"]